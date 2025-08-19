// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPinapplefish<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pinapplefish"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart FinB;
	private final ModelPart FinL;
	private final ModelPart FinR;
	private final ModelPart Body2;
	private final ModelPart Pinapple;
	private final ModelPart Pinapplebase;
	private final ModelPart pinapplestem;

	public ModelPinapplefish(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = this.Body.getChild("Head");
		this.FinB = this.Body.getChild("FinB");
		this.FinL = this.Body.getChild("FinL");
		this.FinR = this.Body.getChild("FinR");
		this.Body2 = this.Body.getChild("Body2");
		this.Pinapple = this.Body.getChild("Pinapple");
		this.Pinapplebase = this.Pinapple.getChild("Pinapplebase");
		this.pinapplestem = this.Pinapple.getChild("pinapplestem");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -6.0F,
				-5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition FinB = Body.addOrReplaceChild("FinB", CubeListBuilder.create().texOffs(8, 7).addBox(-0.5F, -7.0F,
				3.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition FinL = Body.addOrReplaceChild("FinL", CubeListBuilder.create().texOffs(0, 12).addBox(1.0F, -6.0F,
				-1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition FinR = Body.addOrReplaceChild("FinR", CubeListBuilder.create().texOffs(6, 13).addBox(-2.0F,
				-6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F,
				-6.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Pinapple = Body.addOrReplaceChild("Pinapple", CubeListBuilder.create(),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition Pinapplebase = Pinapple.addOrReplaceChild("Pinapplebase", CubeListBuilder.create().texOffs(14, 1)
				.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition pinapplestem = Pinapple.addOrReplaceChild("pinapplestem", CubeListBuilder.create()
				.texOffs(18, 13).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}